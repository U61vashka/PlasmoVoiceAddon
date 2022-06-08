package com.ubivashka.plasmovoice.audio.sources;

import com.ubivashka.plasmovoice.sound.ISound;

public interface IAudioSource {
	/**
	 * Отправка данных звука в сжатом виде с помощью Opus. Если у вас файл, то нужно
	 * отправлять разделяя аудио файл (в данный момент только wav) Смотреть
	 * подробнее об разделении звука wav файла:
	 * <a href="https://stackoverflow.com/questions/2416935/how-to-play-wav-files-with-java">https://stackoverflow.com/questions/2416935/how-to-play-wav-files-with-java</a>
	 * 
	 * @param sound    - Итоговый полный звук сжатый с помощью Opus
	 * @param distance - Дистанция в которой будет воспроизводиться звук
	 */
	void sendAudioData(ISound sound, int distance);

}
